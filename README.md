# server-api

FIXME: description

## Installation

FIXME

## Usage

lein run

## Docker

The application comes with a Dockerfile.

First you need the create an image before launching a container.

To create the image : docker build -t uber-daemon-api .

To launch the container : docker run -dP --name uda uber-daemon-api

For the moment the container downloads every dependencies of the project when it starts so you have to wait a bit.

You can check the status of the container by doing : docker logs uda. When Server start is prompted the server is running and waiting for instructions.

## Examples

You can query the server with a : curl localhost:port

To know the port assigned by docker use : docker ps -l and refer to 0.0.0.0:port->8080/tcp

## License

Copyright © 2016 La Baguette Team

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
