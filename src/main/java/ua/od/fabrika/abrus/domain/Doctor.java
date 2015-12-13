package ua.od.fabrika.abrus.domain;

/**
 * Created by Айси on 13.12.15.
 */
public class Doctor {
    private String firstName;
    private String secondName;
    private DoctorType doctorType;
    private ContactInfo contactInfo;
    private LegalInfo legalInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public DoctorType getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(DoctorType doctorType) {
        this.doctorType = doctorType;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LegalInfo getLegalInfo() {
        return legalInfo;
    }

    public void setLegalInfo(LegalInfo legalInfo) {
        this.legalInfo = legalInfo;
    }
}
