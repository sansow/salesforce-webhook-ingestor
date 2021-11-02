Notes 
==========

Webhook url - http://salesforce-webhook-ingestor-integration.apps.cluster-f45g9.f45g9.sandbox1272.opentlc.com/opportunities


curl -X GET https://redhat12-dev-ed.my.salesforce.com/services/data/v53.0/sobjects/ \
-H 'Authorization: Bearer 00D5f000004b9dj!ARcAQKtPiYzkunu2DRFTnQfAScwyNXMq5l4uFNSJ63S0zd9O_TYObVXmi6DUvMmWNH3iMQMsHP1D7AJrmVjLDEOUUzeFScLE'


Sample payloads
=================

Opportunity update post response 
=================================
recived line items {attributes={type=Opportunity, url=/services/data/v52.0/sobjects/Opportunity/0065f000002NrHhAAK}, Id=0065f000002NrHhAAK, IsDeleted=false, AccountId=0015f000008ipYkAAI, IsPrivate=true, Name=Quarkus - Camel, Description=null, StageName=Proposal/Price Quote, Amount=10000.0, Probability=75.0, ExpectedRevenue=7500.0, TotalOpportunityQuantity=null, CloseDate=2021-10-31, Type=New Customer, NextStep=null, LeadSource=Other, IsClosed=false, IsWon=false, ForecastCategory=Pipeline, ForecastCategoryName=Pipeline, CampaignId=null, HasOpportunityLineItem=false, Pricebook2Id=null, OwnerId=0055f0000040M92AAE, CreatedDate=2021-10-27T20:33:11.000+0000, CreatedById=0055f0000040M92AAE, LastModifiedDate=2021-10-31T22:20:49.000+0000, LastModifiedById=0055f0000040M92AAE, SystemModstamp=2021-10-31T22:20:49.000+0000, LastActivityDate=null, LastStageChangeDate=2021-10-31T22:20:49.000+0000, FiscalQuarter=4, FiscalYear=2021, Fiscal=2021 4, ContactId=null, LastViewedDate=2021-10-31T22:20:50.000+0000, LastReferencedDate=2021-10-31T22:20:50.000+0000, HasOpenActivity=false, HasOverdueTask=false, LastAmountChangedHistoryId=null, LastCloseDateChangedHistoryId=0085f000003dauOAAQ, DeliveryInstallationStatus__c=null, TrackingNumber__c=null, OrderNumber__c=null, CurrentGenerators__c=null, MainCompetitors__c=null}

Result aggregated {LastModifiedDate=2021-10-31T22:20:49.000+0000, LastCloseDateChangedHistoryId=0085f000003dauOAAQ, AccountId=0015f000008ipYkAAI, StageName=Proposal/Price Quote, LastViewedDate=2021-10-31T22:20:50.000+0000, ForecastCategory=Pipeline, LastReferencedDate=2021-10-31T22:20:50.000+0000, type=Opportunity, url=/services/data/v52.0/sobjects/Opportunity/0065f000002NrHhAAK, CloseDate=2021-10-31, Fiscal=2021 4, Name=Quarkus - Camel, SystemModstamp=2021-10-31T22:20:49.000+0000, LastStageChangeDate=2021-10-31T22:20:49.000+0000, Type=New Customer, LeadSource=Other, OwnerId=0055f0000040M92AAE, CreatedById=0055f0000040M92AAE, CreatedDate=2021-10-27T20:33:11.000+0000, Id=0065f000002NrHhAAK, ForecastCategoryName=Pipeline, LastModifiedById=0055f0000040M92AAE}

SF Account 
===========
Raw Response
HTTP/1.1 200 OK
Date: Sun, 31 Oct 2021 21:24:00 GMT
Set-Cookie: CookieConsentPolicy=0:1; domain=redhat12-dev-ed.my.salesforce.com; path=/; expires=Mon, 31-Oct-2022 21:24:00 GMT; Max-Age=31536000
Set-Cookie: LSKey-c$CookieConsentPolicy=0:1; domain=redhat12-dev-ed.my.salesforce.com; path=/; expires=Mon, 31-Oct-2022 21:24:00 GMT; Max-Age=31536000
Strict-Transport-Security: max-age=31536000; includeSubDomains
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
X-Robots-Tag: none
Cache-Control: no-cache,must-revalidate,max-age=0,no-store,private
Set-Cookie: BrowserId=3XB5WDqQEeyp2mPMR1ypoQ; domain=.salesforce.com; path=/; expires=Mon, 31-Oct-2022 21:24:00 GMT; Max-Age=31536000
Sforce-Limit-Info: api-usage=11/15000
ETag: "r+xrsdJ/hKZqeBdLmf9cM6XpLq0fV5VuRhpoyNanCKs=--gzip"
Last-Modified: Wed, 20 Oct 2021 20:35:24 GMT
Content-Type: application/json;charset=UTF-8
Vary: Accept-Encoding
Content-Encoding: gzip
Transfer-Encoding: chunked

{
  "attributes" : {
    "type" : "Account",
    "url" : "/services/data/v52.0/sobjects/Account/0015f000008hCHfAAM"
  },
  "Id" : "0015f000008hCHfAAM",
  "IsDeleted" : false,
  "MasterRecordId" : null,
  "Name" : "Red Hat Customer Sample opp",
  "Type" : "Customer - Direct",
  "ParentId" : null,
  "BillingStreet" : "7 Heaton Street\r\nBudd Lake",
  "BillingCity" : "Budd Lake",
  "BillingState" : "NJ",
  "BillingPostalCode" : "07828",
  "BillingCountry" : "United States",
  "BillingLatitude" : null,
  "BillingLongitude" : null,
  "BillingGeocodeAccuracy" : null,
  "BillingAddress" : {
    "city" : "Budd Lake",
    "country" : "United States",
    "geocodeAccuracy" : null,
    "latitude" : null,
    "longitude" : null,
    "postalCode" : "07828",
    "state" : "NJ",
    "street" : "7 Heaton Street\r\nBudd Lake"
  },
  "ShippingStreet" : "7 Heaton Street\r\nBudd Lake",
  "ShippingCity" : "Budd Lake",
  "ShippingState" : "NJ",
  "ShippingPostalCode" : "07828",
  "ShippingCountry" : "United States",
  "ShippingLatitude" : null,
  "ShippingLongitude" : null,
  "ShippingGeocodeAccuracy" : null,
  "ShippingAddress" : {
    "city" : "Budd Lake",
    "country" : "United States",
    "geocodeAccuracy" : null,
    "latitude" : null,
    "longitude" : null,
    "postalCode" : "07828",
    "state" : "NJ",
    "street" : "7 Heaton Street\r\nBudd Lake"
  },
  "Phone" : null,
  "Fax" : null,
  "AccountNumber" : "123456789",
  "Website" : null,
  "PhotoUrl" : "/services/images/photo/0015f000008hCHfAAM",
  "Sic" : null,
  "Industry" : "Technology",
  "AnnualRevenue" : null,
  "NumberOfEmployees" : 10000,
  "Ownership" : "Public",
  "TickerSymbol" : null,
  "Description" : null,
  "Rating" : "Warm",
  "Site" : null,
  "OwnerId" : "0055f0000040M92AAE",
  "CreatedDate" : "2021-10-12T20:33:25.000+0000",
  "CreatedById" : "0055f0000040M92AAE",
  "LastModifiedDate" : "2021-10-12T20:40:41.000+0000",
  "LastModifiedById" : "0055f0000040M92AAE",
  "SystemModstamp" : "2021-10-20T20:35:24.000+0000",
  "LastActivityDate" : "2021-10-20",
  "LastViewedDate" : "2021-10-26T13:06:32.000+0000",
  "LastReferencedDate" : "2021-10-26T13:06:32.000+0000",
  "Jigsaw" : null,
  "JigsawCompanyId" : null,
  "CleanStatus" : "Pending",
  "AccountSource" : null,
  "DunsNumber" : null,
  "Tradestyle" : null,
  "NaicsCode" : null,
  "NaicsDesc" : null,
  "YearStarted" : null,
  "SicDesc" : null,
  "DandbCompanyId" : null,
  "OperatingHoursId" : null,
  "CustomerPriority__c" : "High",
  "SLA__c" : "Gold",
  "Active__c" : "Yes",
  "NumberofLocations__c" : null,
  "UpsellOpportunity__c" : null,
  "SLASerialNumber__c" : null,
  "SLAExpirationDate__c" : null
}

Accountquery response
======================


