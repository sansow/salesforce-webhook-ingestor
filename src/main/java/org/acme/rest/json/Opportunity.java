package org.acme.rest.json;

public class Opportunity {
    Attributes AttributesObject;
    private String Id;
    private boolean IsDeleted;
    private String AccountId;
    private boolean IsPrivate;
    private String Name;
    private String Description = null;
    private String StageName;
    private float Amount;
    private float Probability;
    private float ExpectedRevenue;
    private String TotalOpportunityQuantity = null;
    private String CloseDate;
    private String Type;
    private String NextStep = null;
    private String LeadSource;
    private boolean IsClosed;
    private boolean IsWon;
    private String ForecastCategory;
    private String ForecastCategoryName;
    private String CampaignId = null;
    private boolean HasOpportunityLineItem;
    private String Pricebook2Id = null;
    private String OwnerId;
    private String CreatedDate;
    private String CreatedById;
    private String LastModifiedDate;
    private String LastModifiedById;
    private String SystemModstamp;
    private String LastActivityDate = null;
    private String LastStageChangeDate;
    private float FiscalQuarter;
    private float FiscalYear;
    private String Fiscal;
    private String ContactId = null;
    private String LastViewedDate;
    private String LastReferencedDate;
    private boolean HasOpenActivity;
    private boolean HasOverdueTask;
    private String LastAmountChangedHistoryId = null;
    private String LastCloseDateChangedHistoryId;
    private String DeliveryInstallationStatus__c = null;
    private String TrackingNumber__c = null;
    private String OrderNumber__c = null;
    private String CurrentGenerators__c = null;
    private String MainCompetitors__c = null;

    // Getter Methods 

    public Attributes getAttributes() {
        return AttributesObject;
    }

    public String getId() {
        return Id;
    }

    public boolean getIsDeleted() {
        return IsDeleted;
    }

    public String getAccountId() {
        return AccountId;
    }

    public boolean getIsPrivate() {
        return IsPrivate;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getStageName() {
        return StageName;
    }

    public float getAmount() {
        return Amount;
    }

    public float getProbability() {
        return Probability;
    }

    public float getExpectedRevenue() {
        return ExpectedRevenue;
    }

    public String getTotalOpportunityQuantity() {
        return TotalOpportunityQuantity;
    }

    public String getCloseDate() {
        return CloseDate;
    }

    public String getType() {
        return Type;
    }

    public String getNextStep() {
        return NextStep;
    }

    public String getLeadSource() {
        return LeadSource;
    }

    public boolean getIsClosed() {
        return IsClosed;
    }

    public boolean getIsWon() {
        return IsWon;
    }

    public String getForecastCategory() {
        return ForecastCategory;
    }

    public String getForecastCategoryName() {
        return ForecastCategoryName;
    }

    public String getCampaignId() {
        return CampaignId;
    }

    public boolean getHasOpportunityLineItem() {
        return HasOpportunityLineItem;
    }

    public String getPricebook2Id() {
        return Pricebook2Id;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public String getCreatedById() {
        return CreatedById;
    }

    public String getLastModifiedDate() {
        return LastModifiedDate;
    }

    public String getLastModifiedById() {
        return LastModifiedById;
    }

    public String getSystemModstamp() {
        return SystemModstamp;
    }

    public String getLastActivityDate() {
        return LastActivityDate;
    }

    public String getLastStageChangeDate() {
        return LastStageChangeDate;
    }

    public float getFiscalQuarter() {
        return FiscalQuarter;
    }

    public float getFiscalYear() {
        return FiscalYear;
    }

    public String getFiscal() {
        return Fiscal;
    }

    public String getContactId() {
        return ContactId;
    }

    public String getLastViewedDate() {
        return LastViewedDate;
    }

    public String getLastReferencedDate() {
        return LastReferencedDate;
    }

    public boolean getHasOpenActivity() {
        return HasOpenActivity;
    }

    public boolean getHasOverdueTask() {
        return HasOverdueTask;
    }

    public String getLastAmountChangedHistoryId() {
        return LastAmountChangedHistoryId;
    }

    public String getLastCloseDateChangedHistoryId() {
        return LastCloseDateChangedHistoryId;
    }

    public String getDeliveryInstallationStatus__c() {
        return DeliveryInstallationStatus__c;
    }

    public String getTrackingNumber__c() {
        return TrackingNumber__c;
    }

    public String getOrderNumber__c() {
        return OrderNumber__c;
    }

    public String getCurrentGenerators__c() {
        return CurrentGenerators__c;
    }

    public String getMainCompetitors__c() {
        return MainCompetitors__c;
    }

    // Setter Methods 

    public void setAttributes(Attributes attributesObject) {
        this.AttributesObject = attributesObject;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setIsDeleted(boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public void setIsPrivate(boolean IsPrivate) {
        this.IsPrivate = IsPrivate;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setStageName(String StageName) {
        this.StageName = StageName;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public void setProbability(float Probability) {
        this.Probability = Probability;
    }

    public void setExpectedRevenue(float ExpectedRevenue) {
        this.ExpectedRevenue = ExpectedRevenue;
    }

    public void setTotalOpportunityQuantity(String TotalOpportunityQuantity) {
        this.TotalOpportunityQuantity = TotalOpportunityQuantity;
    }

    public void setCloseDate(String CloseDate) {
        this.CloseDate = CloseDate;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setNextStep(String NextStep) {
        this.NextStep = NextStep;
    }

    public void setLeadSource(String LeadSource) {
        this.LeadSource = LeadSource;
    }

    public void setIsClosed(boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    public void setIsWon(boolean IsWon) {
        this.IsWon = IsWon;
    }

    public void setForecastCategory(String ForecastCategory) {
        this.ForecastCategory = ForecastCategory;
    }

    public void setForecastCategoryName(String ForecastCategoryName) {
        this.ForecastCategoryName = ForecastCategoryName;
    }

    public void setCampaignId(String CampaignId) {
        this.CampaignId = CampaignId;
    }

    public void setHasOpportunityLineItem(boolean HasOpportunityLineItem) {
        this.HasOpportunityLineItem = HasOpportunityLineItem;
    }

    public void setPricebook2Id(String Pricebook2Id) {
        this.Pricebook2Id = Pricebook2Id;
    }

    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public void setCreatedById(String CreatedById) {
        this.CreatedById = CreatedById;
    }

    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    public void setLastModifiedById(String LastModifiedById) {
        this.LastModifiedById = LastModifiedById;
    }

    public void setSystemModstamp(String SystemModstamp) {
        this.SystemModstamp = SystemModstamp;
    }

    public void setLastActivityDate(String LastActivityDate) {
        this.LastActivityDate = LastActivityDate;
    }

    public void setLastStageChangeDate(String LastStageChangeDate) {
        this.LastStageChangeDate = LastStageChangeDate;
    }

    public void setFiscalQuarter(float FiscalQuarter) {
        this.FiscalQuarter = FiscalQuarter;
    }

    public void setFiscalYear(float FiscalYear) {
        this.FiscalYear = FiscalYear;
    }

    public void setFiscal(String Fiscal) {
        this.Fiscal = Fiscal;
    }

    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    public void setLastViewedDate(String LastViewedDate) {
        this.LastViewedDate = LastViewedDate;
    }

    public void setLastReferencedDate(String LastReferencedDate) {
        this.LastReferencedDate = LastReferencedDate;
    }

    public void setHasOpenActivity(boolean HasOpenActivity) {
        this.HasOpenActivity = HasOpenActivity;
    }

    public void setHasOverdueTask(boolean HasOverdueTask) {
        this.HasOverdueTask = HasOverdueTask;
    }

    public void setLastAmountChangedHistoryId(String LastAmountChangedHistoryId) {
        this.LastAmountChangedHistoryId = LastAmountChangedHistoryId;
    }

    public void setLastCloseDateChangedHistoryId(String LastCloseDateChangedHistoryId) {
        this.LastCloseDateChangedHistoryId = LastCloseDateChangedHistoryId;
    }

    public void setDeliveryInstallationStatus__c(String DeliveryInstallationStatus__c) {
        this.DeliveryInstallationStatus__c = DeliveryInstallationStatus__c;
    }

    public void setTrackingNumber__c(String TrackingNumber__c) {
        this.TrackingNumber__c = TrackingNumber__c;
    }

    public void setOrderNumber__c(String OrderNumber__c) {
        this.OrderNumber__c = OrderNumber__c;
    }

    public void setCurrentGenerators__c(String CurrentGenerators__c) {
        this.CurrentGenerators__c = CurrentGenerators__c;
    }

    public void setMainCompetitors__c(String MainCompetitors__c) {
        this.MainCompetitors__c = MainCompetitors__c;
    }
}
