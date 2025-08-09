module  org.peters.udasecurity.security {
    requires com.google.common;
    requires com.google.gson;
    requires com.miglayout.swing;
    requires java.datatransfer;
    requires java.desktop;
    requires java.prefs;
    requires org.peters.udasecurity.images;
    opens com.google.gson to org.peters.udasecurity.security;
}