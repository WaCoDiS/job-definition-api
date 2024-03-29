/*
 * Copyright 2018-2022 52°North Spatial Information Research GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.wacodis.jobdefinition.streams;

import de.wacodis.jobdefinition.model.WacodisJobDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
@EnableBinding(StreamChannels.class)
public class StreamBinder implements InitializingBean {
    
    private static final Logger LOG = LoggerFactory.getLogger(StreamBinder.class.getName());
    
    @Autowired
    private StreamChannels channels;

    @Override
    public void afterPropertiesSet() throws Exception {
    }
    
    @Async
    public void newJobCreated(WacodisJobDefinition theJob) {
        channels.jobCreation().send(MessageBuilder.withPayload(theJob).build());
        LOG.info("Published a new job: {}", theJob.getId());
        LOG.debug("Job details: {}", theJob);
    }
    
    @Async
    public void jobDeleted(WacodisJobDefinition theJob) {
        channels.jobDeletion().send(MessageBuilder.withPayload(theJob).build());
        LOG.info("Published job deletion: {}", theJob.getId());
    }
    
    @StreamListener(StreamChannels.JOBCREATION_INPUT)
    public void onJobCreated(WacodisJobDefinition job) {
        LOG.info("Job publication confirmed: {}", job.getId());
    }
    
}
