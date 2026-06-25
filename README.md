# 📘 Spring Boot Backend Starter

실무 구조를 기반으로 설계한 Spring Boot REST API 템플릿  
(JPA + Swagger + Layered Architecture + DTO 분리)

---

# 🚀 프로젝트 소개

이 프로젝트는 Spring Boot 기반의 백엔드 구조를  
실무 아키텍처 기준으로 템플릿화한 프로젝트입니다.

단순 CRUD가 아니라  
👉 확장성과 유지보수를 고려한 레이어드 구조로 설계했습니다.

---

# 🧱 기술 스택

- Java 17  
- Spring Boot 3.x  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Lombok  
- Springdoc OpenAPI (Swagger)

---

# 📁 프로젝트 구조

```text
src/main/java/com/example/template
 ├── common
 │    ├── response
 │    └── exception
 ├── config
 ├── user
 │    ├── controller
 │    ├── service
 │    ├── repository
 │    ├── domain
 │    └── dto
 └── TemplateApplication.java
```

# 🧠 설계 포인트

## ✔ 1. Layered Architecture 적용

Controller / Service / Repository 분리  
책임 분리로 유지보수성 확보

---

## ✔ 2. DTO 기반 요청 구조

Entity 직접 노출 금지  
API 요청 구조 분리

---

## ✔ 3. 공통 응답 구조

`ApiResponse<T>`  
모든 API 응답 통일  
프론트 협업 고려 설계

---

## ✔ 4. 전역 예외 처리

`@RestControllerAdvice`  
예외 응답 구조 통일  
안정적인 API 설계

---

## ✔ 5. Swagger API 문서화

API 테스트 및 문서화 자동 제공  
협업 효율성 강화

---

# 📌 실행 방법

```bash
git clone https://github.com/moharago/spring-boot-backend-starter.git
cd spring-boot-backend-starter
./mvnw spring-boot:run
```
# 🌐 API 문서 (Swagger)

http://localhost:8080/swagger-ui/index.html

---

# 🎯 핵심 목표

이 프로젝트는 다음을 목표로 합니다:

- 실무형 Spring Boot 구조 이해  
- 레이어드 아키텍처 설계 경험  
- 확장 가능한 백엔드 구조 설계  
- API 표준화 경험  

---

# 🔥 면접 어필 포인트

이 프로젝트는 단순 CRUD가 아니라:

> “확장성과 유지보수를 고려한 백엔드 구조 설계 경험”

을 보여주기 위한 템플릿입니다.

---

# 🚀 향후 확장 방향

- Spring Security (JWT 인증)  
- Redis 캐싱  
- CI/CD (GitHub Actions)  
- Docker 컨테이너화  

---

# 🧠 한 줄 요약

> “실무 구조 기반으로 설계된 Spring Boot 백엔드 스타터 템플릿”
