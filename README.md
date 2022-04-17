## IMT server

<br>

### How to run

1. `./scripts/build.sh`: 빌드 쉘 스크립트를 실행해 서버를 빌드하고 `jar`파일을 생성합니다. `jar` 파일은 `./build/libs`에 생성됩니다.
2. `./scripts/start.sh`: 서버 실행 쉘 스크립트 실행합니다. 실행 전에 이미 서버가 떠있는지, 8080 포트가 사용중인지 확인해야 합니다. 서버는 백그라운드로 실행됩니다.
3. `./scripts/stop.sh`: 백그라운드로 실행중인 서버를 종료하기 위해서 직접 프로세스를 종료하거나 서버 종료 스크립트를 실행합니다.

<br>

### API docs

`{URL}/swagger-ui/index.html` 을 통해 API 문서를 확인 가능합니다.

e.g. http://3.39.137.243:8080/swagger-ui/index.html

