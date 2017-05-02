package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Tabs implements Serializable {

    @SerializedName("approveTabs")
    private java.util.List<Approve> approveTabs = new java.util.ArrayList<Approve>();

    @SerializedName("checkboxTabs")
    private java.util.List<Checkbox> checkboxTabs = new java.util.ArrayList<Checkbox>();

    @SerializedName("companyTabs")
    private java.util.List<Company> companyTabs = new java.util.ArrayList<Company>();

    @SerializedName("dateSignedTabs")
    private java.util.List<DateSigned> dateSignedTabs = new java.util.ArrayList<DateSigned>();

    @SerializedName("dateTabs")
    private java.util.List<Date> dateTabs = new java.util.ArrayList<Date>();

    @SerializedName("declineTabs")
    private java.util.List<Decline> declineTabs = new java.util.ArrayList<Decline>();

    @SerializedName("emailAddressTabs")
    private java.util.List<EmailAddress> emailAddressTabs = new java.util.ArrayList<EmailAddress>();

    @SerializedName("emailTabs")
    private java.util.List<Email> emailTabs = new java.util.ArrayList<Email>();

    @SerializedName("envelopeIdTabs")
    private java.util.List<EnvelopeId> envelopeIdTabs = new java.util.ArrayList<EnvelopeId>();

    @SerializedName("firstNameTabs")
    private java.util.List<FirstName> firstNameTabs = new java.util.ArrayList<FirstName>();

    @SerializedName("formulaTabs")
    private java.util.List<FormulaTab> formulaTabs = new java.util.ArrayList<FormulaTab>();

    @SerializedName("fullNameTabs")
    private java.util.List<FullName> fullNameTabs = new java.util.ArrayList<FullName>();

    @SerializedName("initialHereTabs")
    private java.util.List<InitialHere> initialHereTabs = new java.util.ArrayList<InitialHere>();

    @SerializedName("lastNameTabs")
    private java.util.List<LastName> lastNameTabs = new java.util.ArrayList<LastName>();

    @SerializedName("listTabs")
    private java.util.List<List> listTabs = new java.util.ArrayList<List>();

    @SerializedName("noteTabs")
    private java.util.List<Note> noteTabs = new java.util.ArrayList<Note>();

    @SerializedName("numberTabs")
    private java.util.List<BigDecimal> numberTabs = new java.util.ArrayList<BigDecimal>();

    @SerializedName("radioGroupTabs")
    private java.util.List<RadioGroup> radioGroupTabs = new java.util.ArrayList<RadioGroup>();

    @SerializedName("signerAttachmentTabs")
    private java.util.List<SignerAttachment> signerAttachmentTabs = new java.util.ArrayList<SignerAttachment>();

    @SerializedName("signHereTabs")
    private java.util.List<SignHere> signHereTabs = new java.util.ArrayList<SignHere>();

    @SerializedName("ssnTabs")
    private java.util.List<Ssn> ssnTabs = new java.util.ArrayList<Ssn>();

    @SerializedName("textTabs")
    private java.util.List<Text> textTabs = new java.util.ArrayList<Text>();

    @SerializedName("titleTabs")
    private java.util.List<Title> titleTabs = new java.util.ArrayList<Title>();

    @SerializedName("viewTabs")
    private java.util.List<View> viewTabs = new java.util.ArrayList<View>();

    @SerializedName("zipTabs")
    private java.util.List<Zip> zipTabs = new java.util.ArrayList<Zip>();


    /**
     * Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.")
    public java.util.List<Approve> getApproveTabs() {
        return approveTabs;
    }

    public void setApproveTabs(java.util.List<Approve> approveTabs) {
        this.approveTabs = approveTabs;
    }


    /**
     * Specifies a tag on the document in a location where the recipient can select an option.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select an option.")
    public java.util.List<Checkbox> getCheckboxTabs() {
        return checkboxTabs;
    }

    public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
        this.checkboxTabs = checkboxTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient's company name to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's company name to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
    public java.util.List<Company> getCompanyTabs() {
        return companyTabs;
    }

    public void setCompanyTabs(java.util.List<Company> companyTabs) {
        this.companyTabs = companyTabs;
    }


    /**
     * Specifies a tab on the document where the date the document was signed will automatically appear.
     **/
    @ApiModelProperty(value = "Specifies a tab on the document where the date the document was signed will automatically appear.")
    public java.util.List<DateSigned> getDateSignedTabs() {
        return dateSignedTabs;
    }

    public void setDateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
        this.dateSignedTabs = dateSignedTabs;
    }


    /**
     * Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained. \n\nIf you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.
     **/
    @ApiModelProperty(value = "Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained. \n\nIf you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.")
    public java.util.List<Date> getDateTabs() {
        return dateTabs;
    }

    public void setDateTabs(java.util.List<Date> dateTabs) {
        this.dateTabs = dateTabs;
    }


    /**
     * Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.")
    public java.util.List<Decline> getDeclineTabs() {
        return declineTabs;
    }

    public void setDeclineTabs(java.util.List<Decline> declineTabs) {
        this.declineTabs = declineTabs;
    }


    /**
     * Specifies a location on the document where you want where you want the recipient\u2019s email, as entered in the recipient information, to display.
     **/
    @ApiModelProperty(value = "Specifies a location on the document where you want where you want the recipient\u2019s email, as entered in the recipient information, to display.")
    public java.util.List<EmailAddress> getEmailAddressTabs() {
        return emailAddressTabs;
    }

    public void setEmailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
        this.emailAddressTabs = emailAddressTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
    public java.util.List<Email> getEmailTabs() {
        return emailTabs;
    }

    public void setEmailTabs(java.util.List<Email> emailTabs) {
        this.emailTabs = emailTabs;
    }


    /**
     * Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.")
    public java.util.List<EnvelopeId> getEnvelopeIdTabs() {
        return envelopeIdTabs;
    }

    public void setEnvelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
        this.envelopeIdTabs = envelopeIdTabs;
    }


    /**
     * Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.
     **/
    @ApiModelProperty(value = "Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.")
    public java.util.List<FirstName> getFirstNameTabs() {
        return firstNameTabs;
    }

    public void setFirstNameTabs(java.util.List<FirstName> firstNameTabs) {
        this.firstNameTabs = firstNameTabs;
    }


    /**
     * Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.
     **/
    @ApiModelProperty(value = "Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.")
    public java.util.List<FormulaTab> getFormulaTabs() {
        return formulaTabs;
    }

    public void setFormulaTabs(java.util.List<FormulaTab> formulaTabs) {
        this.formulaTabs = formulaTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient's name to appear.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's name to appear.")
    public java.util.List<FullName> getFullNameTabs() {
        return fullNameTabs;
    }

    public void setFullNameTabs(java.util.List<FullName> fullNameTabs) {
        this.fullNameTabs = fullNameTabs;
    }


    /**
     * Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.
     **/
    @ApiModelProperty(value = "Specifies a tag location in the document at which a recipient will place their initials. The `optional` parameter specifies whether the initials are required or optional.")
    public java.util.List<InitialHere> getInitialHereTabs() {
        return initialHereTabs;
    }

    public void setInitialHereTabs(java.util.List<InitialHere> initialHereTabs) {
        this.initialHereTabs = initialHereTabs;
    }


    /**
     * Specifies a tag on a document where you want the recipient\u2019s last name to appear. This tag takes the recipient\u2019s name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.
     **/
    @ApiModelProperty(value = "Specifies a tag on a document where you want the recipient\u2019s last name to appear. This tag takes the recipient\u2019s name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.")
    public java.util.List<LastName> getLastNameTabs() {
        return lastNameTabs;
    }

    public void setLastNameTabs(java.util.List<LastName> lastNameTabs) {
        this.lastNameTabs = lastNameTabs;
    }


    /**
     * Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.
     **/
    @ApiModelProperty(value = "Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.")
    public java.util.List<List> getListTabs() {
        return listTabs;
    }

    public void setListTabs(java.util.List<List> listTabs) {
        this.listTabs = listTabs;
    }


    /**
     * Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.
     **/
    @ApiModelProperty(value = "Specifies a location on the document where you want to place additional information, in the form of a note, for a recipient.")
    public java.util.List<Note> getNoteTabs() {
        return noteTabs;
    }

    public void setNoteTabs(java.util.List<Note> noteTabs) {
        this.noteTabs = noteTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response. ")
    public java.util.List<BigDecimal> getNumberTabs() {
        return numberTabs;
    }

    public void setNumberTabs(java.util.List<BigDecimal> numberTabs) {
        this.numberTabs = numberTabs;
    }


    /**
     * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
    public java.util.List<RadioGroup> getRadioGroupTabs() {
        return radioGroupTabs;
    }

    public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
        this.radioGroupTabs = radioGroupTabs;
    }


    /**
     * Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.")
    public java.util.List<SignerAttachment> getSignerAttachmentTabs() {
        return signerAttachmentTabs;
    }

    public void setSignerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
        this.signerAttachmentTabs = signerAttachmentTabs;
    }


    /**
     * A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional.\n
     **/
    @ApiModelProperty(value = "A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional.\n")
    public java.util.List<SignHere> getSignHereTabs() {
        return signHereTabs;
    }

    public void setSignHereTabs(java.util.List<SignHere> signHereTabs) {
        this.signHereTabs = signHereTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
    public java.util.List<Ssn> getSsnTabs() {
        return ssnTabs;
    }

    public void setSsnTabs(java.util.List<Ssn> ssnTabs) {
        this.ssnTabs = ssnTabs;
    }


    /**
     * Specifies a that that is an adaptable field that allows the recipient to enter different text information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
    public java.util.List<Text> getTextTabs() {
        return textTabs;
    }

    public void setTextTabs(java.util.List<Text> textTabs) {
        this.textTabs = textTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient's title to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's title to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
    public java.util.List<Title> getTitleTabs() {
        return titleTabs;
    }

    public void setTitleTabs(java.util.List<Title> titleTabs) {
        this.titleTabs = titleTabs;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<View> getViewTabs() {
        return viewTabs;
    }

    public void setViewTabs(java.util.List<View> viewTabs) {
        this.viewTabs = viewTabs;
    }


    /**
     * Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
     **/
    @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
    public java.util.List<Zip> getZipTabs() {
        return zipTabs;
    }

    public void setZipTabs(java.util.List<Zip> zipTabs) {
        this.zipTabs = zipTabs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tabs tabs = (Tabs) o;
        return Objects.equals(approveTabs, tabs.approveTabs) &&
                Objects.equals(checkboxTabs, tabs.checkboxTabs) &&
                Objects.equals(companyTabs, tabs.companyTabs) &&
                Objects.equals(dateSignedTabs, tabs.dateSignedTabs) &&
                Objects.equals(dateTabs, tabs.dateTabs) &&
                Objects.equals(declineTabs, tabs.declineTabs) &&
                Objects.equals(emailAddressTabs, tabs.emailAddressTabs) &&
                Objects.equals(emailTabs, tabs.emailTabs) &&
                Objects.equals(envelopeIdTabs, tabs.envelopeIdTabs) &&
                Objects.equals(firstNameTabs, tabs.firstNameTabs) &&
                Objects.equals(formulaTabs, tabs.formulaTabs) &&
                Objects.equals(fullNameTabs, tabs.fullNameTabs) &&
                Objects.equals(initialHereTabs, tabs.initialHereTabs) &&
                Objects.equals(lastNameTabs, tabs.lastNameTabs) &&
                Objects.equals(listTabs, tabs.listTabs) &&
                Objects.equals(noteTabs, tabs.noteTabs) &&
                Objects.equals(numberTabs, tabs.numberTabs) &&
                Objects.equals(radioGroupTabs, tabs.radioGroupTabs) &&
                Objects.equals(signerAttachmentTabs, tabs.signerAttachmentTabs) &&
                Objects.equals(signHereTabs, tabs.signHereTabs) &&
                Objects.equals(ssnTabs, tabs.ssnTabs) &&
                Objects.equals(textTabs, tabs.textTabs) &&
                Objects.equals(titleTabs, tabs.titleTabs) &&
                Objects.equals(viewTabs, tabs.viewTabs) &&
                Objects.equals(zipTabs, tabs.zipTabs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approveTabs, checkboxTabs, companyTabs, dateSignedTabs, dateTabs, declineTabs, emailAddressTabs, emailTabs, envelopeIdTabs, firstNameTabs, formulaTabs, fullNameTabs, initialHereTabs, lastNameTabs, listTabs, noteTabs, numberTabs, radioGroupTabs, signerAttachmentTabs, signHereTabs, ssnTabs, textTabs, titleTabs, viewTabs, zipTabs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tabs {\n");

        sb.append("    approveTabs: ").append(toIndentedString(approveTabs)).append("\n");
        sb.append("    checkboxTabs: ").append(toIndentedString(checkboxTabs)).append("\n");
        sb.append("    companyTabs: ").append(toIndentedString(companyTabs)).append("\n");
        sb.append("    dateSignedTabs: ").append(toIndentedString(dateSignedTabs)).append("\n");
        sb.append("    dateTabs: ").append(toIndentedString(dateTabs)).append("\n");
        sb.append("    declineTabs: ").append(toIndentedString(declineTabs)).append("\n");
        sb.append("    emailAddressTabs: ").append(toIndentedString(emailAddressTabs)).append("\n");
        sb.append("    emailTabs: ").append(toIndentedString(emailTabs)).append("\n");
        sb.append("    envelopeIdTabs: ").append(toIndentedString(envelopeIdTabs)).append("\n");
        sb.append("    firstNameTabs: ").append(toIndentedString(firstNameTabs)).append("\n");
        sb.append("    formulaTabs: ").append(toIndentedString(formulaTabs)).append("\n");
        sb.append("    fullNameTabs: ").append(toIndentedString(fullNameTabs)).append("\n");
        sb.append("    initialHereTabs: ").append(toIndentedString(initialHereTabs)).append("\n");
        sb.append("    lastNameTabs: ").append(toIndentedString(lastNameTabs)).append("\n");
        sb.append("    listTabs: ").append(toIndentedString(listTabs)).append("\n");
        sb.append("    noteTabs: ").append(toIndentedString(noteTabs)).append("\n");
        sb.append("    numberTabs: ").append(toIndentedString(numberTabs)).append("\n");
        sb.append("    radioGroupTabs: ").append(toIndentedString(radioGroupTabs)).append("\n");
        sb.append("    signerAttachmentTabs: ").append(toIndentedString(signerAttachmentTabs)).append("\n");
        sb.append("    signHereTabs: ").append(toIndentedString(signHereTabs)).append("\n");
        sb.append("    ssnTabs: ").append(toIndentedString(ssnTabs)).append("\n");
        sb.append("    textTabs: ").append(toIndentedString(textTabs)).append("\n");
        sb.append("    titleTabs: ").append(toIndentedString(titleTabs)).append("\n");
        sb.append("    viewTabs: ").append(toIndentedString(viewTabs)).append("\n");
        sb.append("    zipTabs: ").append(toIndentedString(zipTabs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
