package com.audit.Data;
import org.json.JSONObject;

//import org.json;

public class APIActivityRecord {

    String id;
    String type;
    String stamp;
    JSONObject jsonPackage;

    public com.audit.Data.APICallType getAPICallType() {

        if (this.type.equals("ACCOUNT")) {
            return com.audit.Data.APICallType.ACCOUNT_OPEN;
        } else if (this.type.equals("ALLOCATION")) 
            return com.audit.Data.APICallType.ALLOCATION_MODEL;

        return com.audit.Data.APICallType.ACCOUNT_OPEN;
    }



    public String getAttribute(APIAttribute attribute) {

        if (attribute== APIAttribute.ID) {
            return this.id;
        } 
        String attributeString = attribute.toString();

        Object value = this.jsonPackage.get(attributeString.toLowerCase());

        return value.toString();
    }


    
}
