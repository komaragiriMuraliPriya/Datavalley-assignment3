class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;
    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        Organization org1 = new Organization("001", "XYZ Corp", "123 Main St");
        Organization org2 = null;
        try {
            org2 = (Organization) org1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Details of org1:");
        org1.printDetails();
        System.out.println("\nDetails of org2 (clone of org1):");
        org2.printDetails();
    }
}
