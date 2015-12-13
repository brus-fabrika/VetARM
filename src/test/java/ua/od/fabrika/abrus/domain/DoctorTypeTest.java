package ua.od.fabrika.abrus.domain;

import static org.junit.Assert.*;

/**
 * Created by Айси on 13.12.15.
 */
public class DoctorTypeTest {

    @org.junit.Test
    public void testCreateDefault() throws Exception {
        DoctorType doctorType = new DoctorType();
        assertEquals("Invalid DoctorType default name", "", doctorType.getName());
        assertEquals("Invalid DoctorType default id", -1, doctorType.getId());
    }

    @org.junit.Test
    public void testCreateCustom() throws Exception {
        DoctorType doctorType = new DoctorType(12345, "Doctor");
        assertEquals("Invalid DoctorType name", "Doctor", doctorType.getName());
        assertEquals("Invalid DoctorType id", 12345, doctorType.getId());
    }

    @org.junit.Test(expected=IllegalArgumentException.class)
    public void testCreateNullName() throws Exception {
        DoctorType doctorType = new DoctorType(12345, null);
    }

    @org.junit.Test
    public void testGetNameDefault() throws Exception {
        DoctorType doctorType = new DoctorType();
        assertEquals("Invalid DoctorType default name", "", doctorType.getName());
    }

    @org.junit.Test
    public void testGetNameConstruct() throws Exception {
        DoctorType doctorType = new DoctorType(12345, "Nurse");
        assertEquals("Invalid DoctorType name", "Nurse", doctorType.getName());
    }

    @org.junit.Test
    public void testSetName() throws Exception {
        DoctorType doctorType = new DoctorType();
        doctorType.setName("Nurse");
        assertEquals("Invalid DoctorType name", "Nurse", doctorType.getName());
    }

    @org.junit.Test(expected=IllegalArgumentException.class)
    public void testSetNameNull() throws Exception {
        DoctorType doctorType = new DoctorType();
        String nullValue = null;
        doctorType.setName(nullValue);
    }

    @org.junit.Test
    public void testGetIdDefault() throws Exception {
        DoctorType doctorType = new DoctorType();
        assertEquals("Invalid DoctorType default id", -1, doctorType.getId());
    }

    @org.junit.Test
    public void testGetIdConstruct() throws Exception {
        DoctorType doctorType = new DoctorType(12345, "Nurse");
        assertEquals("Invalid DoctorType default id", 12345, doctorType.getId());
    }

    @org.junit.Test
    public void testSetId() throws Exception {
        DoctorType doctorType = new DoctorType();
        doctorType.setId(12345);
        assertEquals("Invalid DoctorType id", 12345, doctorType.getId());
    }

    @org.junit.Test
    public void testToStringDefault() throws Exception {
        DoctorType doctorType = new DoctorType();
        assertEquals("Invalid DoctorType string value", "DoctorType{id=-1, name=''}", doctorType.toString());
    }
}