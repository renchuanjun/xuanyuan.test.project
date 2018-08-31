package org.open;

import org.open.config.BaseConfigProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lenovo on 2017/4/17.
 */
@ConfigurationProperties(prefix="config")
public class ConfigProperties extends BaseConfigProperties {

}
