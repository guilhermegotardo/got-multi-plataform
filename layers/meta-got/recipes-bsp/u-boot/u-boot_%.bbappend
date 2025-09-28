# u-boot src
FILESEXTRAPATHS:prepend := "${TOPDIR}/../sources/u-boot:"

# path to get the file
SRC_URI = "file://u-boot_2024-01"

# Define WORKDIR path
S = "${WORKDIR}/u-boot_2024-01"