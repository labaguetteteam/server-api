# server-api

FIXME: description

## Installation

FIXME

## Usage

lein run

## Docker

The application comes with a Dockerfile.

First you need the create an image before launching a container.

To create the image use :

```bash
lein run -s "SERVER_TOKEN"
```

To launch the container use :
```bash
lein run -s "SERVER_TOKEN"
```

For the moment the container downloads every dependencies of the project when it starts so you have to wait a bit.

You can check the status of the container by doing :
```bash
lein run -s "SERVER_TOKEN"
```
When \"Server start\" is prompted the server is running and waiting for instructions.

## Examples

You can query the server with a :
```bash
lein run -s "SERVER_TOKEN"
```

To know the port assigned by docker use :
```bash
lein run -s "SERVER_TOKEN"
```
and refer to 0.0.0.0:port->8080/tcp

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
