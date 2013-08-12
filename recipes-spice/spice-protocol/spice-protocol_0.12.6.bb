DESCRIPTION = "SPICE protocol headers"
LICENSE = ""
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=b37311cb5604f3e5cc2fb0fd23527e95"

SRC_URI = "http://spice-space.org/download/releases/${PN}-${PV}.tar.bz2"

SRC_URI[md5sum] = "797d18156ab893e48778cb097b21bb2b"
SRC_URI[sha256sum] = "9d4745602eb2ab1d1c1ab98b4babf587574870993b4faefe354ac57bb5e8259b"

inherit autotools pkgconfig

#do_configure(){
#	./configure
#}
#do_compile(){
#	oe_runmake
	
#}
