# Новостной портал на Java Servlets

Этот проект представляет собой новостной портал на Java, использующий сервлеты для обработки HTTP запросов. В проекте реализованы следующие компоненты и технологии:

- Коннекшн пул для эффективного управления подключениями к базе данных.
- Структура MVC (Model-View-Controller) для разделения бизнес-логики, представления и взаимодействия с пользователем.
- DAO (Data Access Object) слой для работы с базой данных.
- Сервисы для выполнения бизнес-логики приложения.
- Различные паттерны проектирования (например, Фабричный метод, Singleton).
- Билдер паттерн для построения сложных объектов.
- Команда паттерн для инкапсуляции действий в отдельные объекты.
- Использование синглтона для гарантирования единственного экземпляра класса.

Новостной портал на Java Servlets
Этот проект представляет собой новостной портал на Java, использующий сервлеты для обработки HTTP запросов. В проекте реализованы следующие компоненты и технологии:

Настройка конфигурации
Контроллеры
DAO слой
Безопасность
Сервисы
Утилиты
Структура проекта
![image](https://github.com/DimSelyutin/newsapp/assets/102747240/93601411-a695-43eb-a6bb-07665489278c)

    src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           └── newsportal
        │               ├── bean
        │               │   ├── EncriptedPassword.java
        │               ├── controller
        │               │   ├── impl
        │               │   ├── CommandProvider.java
        │               │   ├── Command.java
        │               │   ├── CommandName.java
        │               │   └── MainController.java
        │               ├── dao
        │               │   ├── connectionpool
        │               │   ├── impl
        │               │   ├── DaoException.java
        │               │   ├── DaoProvider.java
        │               │   ├── ICommentDAO.java
        │               │   ├── INewsDAO.java
        │               │   ├── IUserDAO.java
        │               │   └── NewsDAOException.java
        │               ├── security
        │               ├── service
        │               │    ──── impl
        │               │    ├── ICommentService.java
        │               │    ├── INewsService.java
        │               │    ├── IUserService.java
        │               │    ├── ServiceException.java
        │               │    └── ServiceProvider.java
        │               ├── util  


    
Описание компонентов
  bean: Пакет для POJO классов, таких как EncriptedPassword.
  controller: Содержит контроллеры для обработки HTTP запросов версии v3.0.
  dao: Директория с классами доступа к данным версии v3.0.
  security: Здесь находится код, отвечающий за безопасность приложения версии v3.0.
  service: Пакет с сервисами бизнес-логики версии v3.0.
  util: Утилитарные классы.


## Запуск проекта

1. Клонируйте репозиторий на локальную машину.
2. Импортируйте проект в IDE.
3. Настройте конфигурацию сервера и базы данных в `config` пакете.
4. Запустите приложение и откройте новостной портал в браузере.

## Дополнительная информация

Дополните README файл описанием функциональности вашего новостного портала, инструкциями по установке и запуску проекта, а также любой другой полезной информацией или особенностями вашего курсового проекта.

Такой README файл поможет другим разработчикам быстро ознакомиться с вашим проектом и начать работу над ним. Однако не забудьте актуализировать информацию в README файле по мере изменений и развития проекта.
