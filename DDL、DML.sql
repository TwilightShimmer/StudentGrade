create table if not exists admins
(
    admin_id   int auto_increment
        primary key,
    admin_name varchar(50) not null,
    password   varchar(50) null
);

create table if not exists courses
(
    course_id    int auto_increment
        primary key,
    course_name  varchar(50) not null,
    teacher_name varchar(50) not null,
    credit       int         not null,
    description  text        null
);

create table if not exists exam_schedule
(
    exam_id     int auto_increment
        primary key,
    subject     varchar(100) not null,
    exam_date   date         not null,
    start_time  time         not null,
    end_time    time         not null,
    location    varchar(255) null,
    description text         null
);

create table if not exists question
(
    question_id    int auto_increment
        primary key,
    content        text                                             not null,
    option_a       varchar(255)                                     null,
    option_b       varchar(255)                                     null,
    option_c       varchar(255)                                     null,
    option_d       varchar(255)                                     null,
    correct_answer char                                             null,
    difficulty     enum ('easy', 'medium', 'hard') default 'medium' null,
    subject        varchar(100)                                     null
);

create table if not exists students
(
    student_id   int auto_increment
        primary key,
    student_name varchar(50) not null,
    class_id     int         null,
    password     varchar(50) null
);

create table if not exists grades
(
    grade_id   int auto_increment
        primary key,
    student_id int           not null,
    course_id  int           not null,
    score      decimal(5, 2) not null,
    constraint fk_course_id
        foreign key (course_id) references courses (course_id),
    constraint fk_student_id
        foreign key (student_id) references students (student_id)
);

create table if not exists selected_course
(
    id            int auto_increment
        primary key,
    student_id    int                                not null,
    course_id     int                                not null,
    selected_time datetime default CURRENT_TIMESTAMP null,
    constraint selected_course_ibfk_1
        foreign key (student_id) references students (student_id),
    constraint selected_course_ibfk_2
        foreign key (course_id) references courses (course_id)
);

create index course_id
    on selected_course (course_id);

create index student_id
    on selected_course (student_id);

INSERT INTO admins (admin_id, admin_name, password) VALUES
(1, '李老师', '123456'),
(2, '王老师', '123456'),
(3, '张老师', '123456'),
(4, '刘老师', '123456'),
(5, '陈老师', '123456'),
(6, '朱老师', '123456'),
(7, '赵老师', '123456'),
(8, '黄老师', '123456'),
(9, '孙老师', '123456'),
(10, '钱老师', '123456');

INSERT INTO courses (course_id, course_name, teacher_name, credit, description) VALUES
(1, '数学', '李老师', 1, '这是一个课程描述'),
(2, '英语', '李老师', 1, '这是一个课程描述'),
(3, '物理', '李老师', 2, '这是一个课程描述'),
(4, '化学', '李老师', 2, '这是一个课程描述'),
(5, '生物', '李老师', 3, '这是一个课程描述'),
(6, '历史', '李老师', 4, '这是一个课程描述'),
(7, '政治', '王老师', 2, '思想政治与社会常识'),
(8, '地理', '刘老师', 2, '自然地理与人文地理基础'),
(9, '信息技术', '陈老师', 1, '计算机基础与网络知识'),
(10, '美术', '朱老师', 1, '艺术欣赏与绘画基础');

INSERT INTO exam_schedule (exam_id, subject, exam_date, start_time, end_time, location, description) VALUES
(1, '数学', '2025-06-10', '09:00:00', '11:00:00', '教学楼A101', '闭卷考试'),
(2, '英语', '2025-06-11', '14:00:00', '16:00:00', '教学楼B203', '含听力部分'),
(3, '物理', '2025-06-12', '09:00:00', '11:00:00', '教学楼C305', '带计算器入场'),
(4, '化学', '2025-06-13', '14:00:00', '16:00:00', '实验楼D102', '需穿实验服'),
(5, '生物', '2025-06-14', '09:00:00', '11:00:00', '教学楼A102', '闭卷考试'),
(6, '政治', '2025-06-15', '14:00:00', '16:00:00', '教学楼B204', '开卷考试'),
(7, '地理', '2025-06-16', '09:00:00', '11:00:00', '教学楼C306', '含地图分析题'),
(8, '信息技术', '2025-06-17', '14:00:00', '16:00:00', '实验楼D103', '上机操作'),
(9, '美术', '2025-06-18', '09:00:00', '11:00:00', '艺术楼E201', '现场作画'),
(10, '语文', '2025-06-19', '14:00:00', '16:00:00', '教学楼A103', '作文为主');

INSERT INTO question (question_id, content, option_a, option_b, option_c, option_d, correct_answer, difficulty, subject) VALUES
(1, '以下哪个是质数？', '2', '4', '6', '8', 'A', 'easy', '数学'),
(2, '“光合作用”主要发生在植物的哪个器官？', '根', '茎', '叶', '花', 'C', 'medium', '生物'),
(3, '英语中，“dog”指的是什么动物？', '猫', '狗', '鸟', '鱼', 'B', 'easy', '英语'),
(4, '牛顿第一定律又称为：', '作用力定律', '惯性定律', '加速度定律', '万有引力定律', 'B', 'medium', '物理'),
(5, '中国四大发明不包括：', '造纸术', '印刷术', '火药', '指南针', '无', 'hard', '历史'),
(6, '水的化学式是？', 'H2O', 'CO2', 'O2', 'H2SO4', 'A', 'easy', '化学'),
(7, '中国最长的河流是？', '长江', '黄河', '珠江', '黑龙江', 'A', 'medium', '地理'),
(8, '太阳系中最大的行星是哪颗？', '木星', '土星', '火星', '地球', 'A', 'easy', '物理'),
(9, '下列哪个不是编程语言？', 'Java', 'Python', 'Photoshop', 'JavaScript', 'C', 'medium', '信息技术'),
(10, '梵高是哪个国家的画家？', '法国', '荷兰', '意大利', '西班牙', 'B', 'hard', '美术');

INSERT INTO students (student_id, student_name, class_id, password) VALUES
(1, '张三', 1, '123456'),
(2, '李四', 1, '123456'),
(3, '王五', 2, '123456'),
(4, '赵六', 2, '123456'),
(5, '孙七', 1, '123456'),
(6, '周八', 2, '123456'),
(7, '吴九', 1, '123456'),
(8, '郑十', 2, '123456'),
(9, '陈十一', 1, '123456'),
(10, '林十二', 2, '123456'),
(11, '刘晟忞', 2, '123456'),
(12, '李任远', 1, '123456');