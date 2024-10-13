package io.jenkins.plugins.env_variables_status_sync.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: kun.tang@daocloud.io
 * Date:2024/9/21
 * Time:18:54
 */
@Getter
@AllArgsConstructor
public enum ConstantsEnums {
    JOB_EXECUTE_STATUS("jobExecuteStatus"),
    BUILD_NUMBER("buildNo");
    private final String lowCase;
}
