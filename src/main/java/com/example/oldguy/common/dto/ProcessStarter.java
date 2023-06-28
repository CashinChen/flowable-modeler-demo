package com.example.oldguy.common.dto;

import java.util.Map;

public class ProcessStarter {

    private String processInstanceByKey;

    private Map<String, Object> variables;

    public String getProcessInstanceByKey() {
        return processInstanceByKey;
    }

    public void setProcessInstanceByKey(String processInstanceByKey) {
        this.processInstanceByKey = processInstanceByKey;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }
}
