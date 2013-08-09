DESCRIPTION = "Celt low-latency audio codec files."
LICENSE = ""
PR="r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=375f60ab360d17f0172737036ff155b2"

SRC_URI = "http://downloads.us.xiph.org/releases/celt/celt-0.5.1.3.tar.gz"

SRC_URI[md5sum] = "67e7b5e45db57a6f1f0a6962f5ecb190"
SRC_URI[sha256sum] = "fc2e5b68382eb436a38c3104684a6c494df9bde133c139fbba3ddb5d7eaa6a2e"

inherit autotools pkgconfig
