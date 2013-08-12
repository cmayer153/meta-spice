DESCRIPTION = "SPICE client"
LICENSE = "GPLv2+"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "http://spice-space.org/download/releases/${PN}-${PV}.tar.bz2"

SRC_URI[md5sum] = "325b1c42ce24e75de45a75876b73a8bd"
SRC_URI[sha256sum] = "cf063e7df42e331a835529d2f613d8a01f8cb2963e8edaadf73a8d65c46fb387"

DEPENDS = "jpeg cyrus-sasl glib-2.0"

inherit autotools pkgconfig

EXTRA_OECONF = "--disable-smartcard"

#do_configure(){
#	./configure
#}
