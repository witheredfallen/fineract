/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.infrastructure.campaigns.sms.constants;

public interface SmsCampaignConstants {

    String SMS_CAMPAIGN_NAME = "sms";

    String RESOURCE_NAME = "SMSCAMPAIGN";

    String SMS_BRIDGE = "sms_bridge";

    String SMS = "sms";

    String FINERACT_PLATFORM_TENANT_ID = "Fineract-Platform-TenantId";

    String FINERACT_TENANT_APP_KEY = "Fineract-Tenant-App-Key";
    
    //Supported Triggered Campaigns
    
    String LOAN_REJECT = "Loan Rejected" ;
    
    String LOAN_APPROVED = "Loan Approved" ;
    
    String LOAN_REPAYMENT = "Loan Repayment" ;
    
}
