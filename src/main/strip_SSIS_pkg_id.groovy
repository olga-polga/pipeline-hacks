node {
    def packageID_before = "IS_SF_Contact:15.0.0.73.5"
    def packageID_after  = "IS_SF_Contact:15.0.0.73"
    def match  = packageID_before =~ /^[a-zA-Z0-9_]*:\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}/

    assert packageID_after == match[0]
}
