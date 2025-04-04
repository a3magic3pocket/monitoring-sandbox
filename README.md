# monitoring-sandbox
node_exporter, spring_exporter를 서버에 설치하고  
프로메테우스로 서버 메트릭을 수집합니다.  
그라파나로 프로메테우스를 조회하여 시각화합니다.  
얼럿매니저로 프로메테우스에 알람 룰을 적용하여 알람을 전송합니다.

## 스프링 서버 빌드
- ```bash
  cd monitoring-sandbox
  
  ./gradlew clean build
  ```

## 스프링 서버 이미지 빌드
- ```bash
  cd monitoring-sandbox
  
  docker build -t monitoring:0.0.1 -f docker/Dockerfile .
  ```

## 도커 컨테이너 실행(백그라운드 실행)
- ```bash
  cd monitoring-sandbox
  
  docker-compose up -d
  ```

## 확인
- node_exporter 동작 여부 확인
  - http://localhost:9100/metrics
- spring_exporter 동작 여부 확인
  - http://localhost:8080/actuator/prometheus
- 프로메테우스 확인
  - http://localhost:9090
- 프로메테우스 알람 룰 셋 확인
  - http://localhost:9090/alerts
- 그라파나 확인(admin/admin)
  - http://localhost:3000
- 얼럿매니저 확인
  - http://localhost:9093/#/alerts

