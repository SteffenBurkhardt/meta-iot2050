#
# Copyright (c) Siemens AG, 2018-2021
#
# This file is subject to the terms and conditions of the MIT License.  See
# COPYING.MIT file in the top-level directory.
#

require linux-iot2050-5.10.inc

KERNEL_SOURCE = "https://cdn.kernel.org/pub/linux/kernel/v5.x/linux-${PV}.tar.xz"

SRC_URI[sha256sum] = "098dd5024d14b01a5ce85a6fec3dd829f4ac62488e4c59004a4687f8bbf886b1"

S = "${WORKDIR}/linux-${PV}"
