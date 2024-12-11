USE CelebDB;

-- 1. 외래 키 제약 삭제 (Player 테이블에서)
ALTER TABLE Player DROP FOREIGN KEY player_ibfk_1;

-- 2. 기존 테이블 삭제
DROP TABLE IF EXISTS Team;
DROP TABLE IF EXISTS Player;

-- 3. 부모 테이블 (팀 정보) 생성
CREATE TABLE Team (
    team_id INT AUTO_INCREMENT PRIMARY KEY,
    team_name VARCHAR(50) NOT NULL,
    city VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 4. 자식 테이블 (선수 정보) 생성
CREATE TABLE Player (
    player_id INT AUTO_INCREMENT PRIMARY KEY,
    player_name VARCHAR(50) NOT NULL,
    position VARCHAR(20),
    age INT,
    team_id INT,
    FOREIGN KEY (team_id) REFERENCES Team(team_id) ON DELETE CASCADE
    -- ON DELETE CASCADE 팀삭제시, 해당 팀에 속한 선수들도자동으로 삭제된다.
    
);

-- 5. 팀 데이터 삽입
INSERT INTO Team (team_name, city) VALUES
('Lions', 'Seoul'),
('Tigers', 'Busan'),
('Bears', 'Incheon');

-- 6. 선수 데이터 삽입 (참조 키 포함)
INSERT INTO Player (player_name, position, age, team_id) VALUES
('Kim Minsoo', 'Pitcher', 25, 1),
('Lee Joon', 'Catcher', 28, 1),
('Park Sungwoo', 'Batter', 30, 2),
('Choi Hyunwoo', 'Pitcher', 24, 3);
