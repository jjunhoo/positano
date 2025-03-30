CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,  -- 자동 증가하는 ID 컬럼
    name VARCHAR(255) NOT NULL,            -- 이름 컬럼 (NULL 허용 안 함)
    email VARCHAR(255) NOT NULL,           -- 이메일 컬럼 (NULL 허용 안 함)
    UNIQUE(email)                          -- 이메일 유니크 설정
);