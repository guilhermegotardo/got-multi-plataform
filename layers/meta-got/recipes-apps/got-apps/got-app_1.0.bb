SUMMARY = "Test application from Got Target"
DESCRIPTION = "C App that runs cyclic as systemd service"

LICENSE = "CLOSED"

SRC_URI = " \
    file://got-app.c \
    file://got-app.service \
"

S = "${UNPACKDIR}"

inherit systemd

SYSTEMD_SERVICE:${PN} = "got-app.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/got-app.c -o got-app
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/got-app ${D}${bindir}/got-app

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${S}/got-app.service \
        ${D}${systemd_system_unitdir}/got-app.service
}

FILES:${PN} += " \
    ${bindir}/got-app \
    ${systemd_system_unitdir}/got-app.service \
"