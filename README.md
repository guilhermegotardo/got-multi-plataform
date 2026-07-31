# Got Target Environment

This project provides a script to install and configure the development environment.

The script clones the required repositories, initializes the BitBake environment, and configures the build directory.

## Requirements

Before running the script, install:

* Git
* Python 3

## Installation

Make the script executable:

```bash
chmod +x init-environment.sh
```

Run the installation:

```bash
./init-environment.sh
```

To remove the current environment and install it again:

```bash
./init-environment.sh -f
```

## Activate the Environment

After the installation, activate the environment using the command shown by the script.

Example:

```bash
source setup-qemu-env
```

The exact path may be different depending on the setup directory name.

## Build an Image

After activating the environment, run:

```bash
bitbake got-image
```

## AppArmor

On Ubuntu systems, the script can configure AppArmor to allow BitBake to use user namespaces.

This step requires administrator permissions and may ask for the `sudo` password.

The AppArmor profile is stored at:

```text
/etc/apparmor.d/bitbake
```

## Reinstallation

Use the `-f` option to remove the existing BitBake and build directories before installing again:

```bash
./init-environment.sh -f
```

