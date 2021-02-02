package io.wegetit.elmer.logproducer;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogProducerService {

    @Scheduled(fixedDelay = 1000)
    private void process() {
        log.info(RandomStringUtils.randomAlphabetic(100));
    }
}
