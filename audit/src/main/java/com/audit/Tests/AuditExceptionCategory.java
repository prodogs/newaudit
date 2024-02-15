package com.audit.Tests;

import com.audit.Data.APIAttribute;

public enum AuditExceptionCategory {
    MSG_ACCOUNT_NUMBER_MISMATCH(1),
    MSG_ACCOUNT_NOT_FOUND(66    ),   
    MSG_PLAN_NUMBER_MISMATCH(2),
    MSG_FIRST_NM_MISMATCH(3),
    MSG_LAST_NM_MISMATCH(4),
    MSG_NAME_SFFX(5),
    MSG_GENDER_MISMATCH(6),
    MSG_DOB_MISMATCH(7),
    MSG_SSN_MISMATCH(8),
    MSG_MARITAL_STATUS_MISMATCH(9),
    MSG_CITIZENSHIP_MISMATCH(10),
    MSG_CITIZENSHIP_NOT_US(11),
    MSG_EMAIL_ADDRESS_MISMATCH(12),
    MSG_PRIMARY_PHONE_NUMBER_MISMATCH(13),
    MSG_PRIMARY_PHONE_NUMBER_TYPE_MISMATCH(14),
    MSG_ADDRESS_LINE_1_MISMATCH(15),
    MSG_ADDRESS_LINE_2_MISMATCH(16),
    MSG_CITY_MISMATCH(17),
    MSG_STATE_MISMATCH(18),
    MSG_ZIP_CODE_MISMATCH(19),
    MSG_COUNTRY_MISMATCH(20),
    MSG_COUNTRY_NOT_US(21),
    MSG_MOTHERS_MAIDEN_NAME_MISMATCH(22),
    MSG_PRIM_BENE_ENTITY_MISMATCH(23),
    MSG_PRIM_BENE_RELATIONSHIP_MISMATCH(24),
    MSG_PRIM_BENE_FIRST_NAME_MISMATCH(25),
    MSG_PRIM_BENE_LAST_NAME_MISMATCH(26),
    MSG_PRIM_BENE_SUFFIX_MISMATCH(27),
    MSG_PRIM_BENE_GENDER_MISMATCH(28),
    MSG_PRIM_BENE_DOB_MISMATCH(29),
    MSG_PRIM_BENE_SSN_MISMATCH(30),
    MSG_PRIM_BENE_PHONE_NUMBER_MISMATCH(31),
    MSG_PRIM_BENE_PERCENTAGE_MISMATCH(32),
    MSG_PRIM_BENE_ADDRESS_LINE_1_MISMATCH(33),
    MSG_PRIM_BENE_CITY_MISMATCH(34),
    MSG_PRIM_BENE_STATE_MISMATCH(35),
    MSG_PRIM_BENE_ZIP_MISMATCH(36),
    MSG_CNTG_BENE_ENTITY_MISMATCH(37),
    MSG_CNTG_BENE_RELATIONSHIP_MISMATCH(38),
    MSG_CNTG_BENE_FIRST_NAME_MISMATCH(39),
    MSG_CNTG_BENE_LAST_NAME_MISMATCH(40),
    MSG_CNTG_BENE_SUFFIX_MISMATCH(41),
    MSG_CNTG_BENE_GENDER_MISMATCH(42),
    MSG_CNTG_BENE_DOB_MISMATCH(43),
    MSG_CNTG_BENE_SSN_MISMATCH(44),
    MSG_CNTG_BENE_PHONE_NUMBER_MISMATCH(45),
    MSG_CNTG_BENE_PERCENTAGE_MISMATCH(46),
    MSG_CNTG_BENE_ADDRESS_LINE_1_MISMATCH(47),
    MSG_CNTG_BENE_CITY_MISMATCH(48),
    MSG_CNTG_BENE_STATE_MISMATCH(49),
    MSG_CNTG_BENE_ZIP_CODE_MISMATCH(50),
    MSG_TPP_IRA_NOT_SUBSCRIBED(51),
    MSG_TPP_IRA_NOT_SUBSCRIBED_WITH_BALANCE(52),
    MSG_EDELIVERY_SELECTION_MISMATCH(53),
    MSG_TPP_IRA_AWD_NO_FORMS(54),
    MSG_FUND_DESC_CODE_PERCENT_MISMATCH(56),
    MSG_FUND_DESC_NOT_AVAILABLE(57),
    MSG_FUND_ALLOCATION_PERCENT_TOTAL_OVER_100(58),
    MSG_FUND_ALLOCATION_PERCENT_TOTAL_UNDER_100(59),
    TRANSACTION_STATUS_RESPONSE_MSG_FOR_FAILURE(60),
    MSG_NO_ACCOUNT_REBALANCE_OVER_3_MONTHS(61),
    MSG_REBALANCED_FUND_TOTAL_INCORRECT_PERCENT(62),
    MSG_REBALANCE_FAILED_NO_KNOWN_REASON(63),
    MSG_REBALANCE_FAILED_KNOWN_REASON(64),
    MSG_PRIOR_QTR_FEE_COMPARISON_OUT_OF_RANGE_PERCENT(65);

    @SuppressWarnings("unused")
    private final int value;

    public String getExceptionReason(APIAttribute attribute) {
        return "";
    }

    public String getExceptionMessage(APIAttribute attribute) {
        return "";
    }
    private AuditExceptionCategory(int value) {
        this.value = value;
        
    }
    
}
