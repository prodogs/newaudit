package com.audit.Data;
import org.json.JSONObject;

//import org.json;

public class APIActivityRecord {

    String id;
    String type;
    String stamp;
    JSONObject jsonPackage;

    public com.audit.Data.APICallType getAPICallType() {
        return com.audit.Data.APICallType.ACCOUNT_OPEN;
    }

    public String getAttribute(APIAttribute attribute) {
        String attributeString = attribute.toString();
        Object value = this.jsonPackage.get(attributeString.toLowerCase());

        return value.toString();
    }


    
}
