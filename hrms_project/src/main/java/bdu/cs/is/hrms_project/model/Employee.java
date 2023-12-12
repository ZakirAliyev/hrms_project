    package bdu.cs.is.hrms_project.model;

    import bdu.cs.is.hrms_project.enums.JobEnum;
    import bdu.cs.is.hrms_project.enums.SexEnum;
    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import java.util.Date;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "employees")
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long employeeId;

        @Column(name = "first_name", nullable = false)
        private String firstName;

        @Column(name = "last_name", nullable = false)
        private String lastName;

        @Column(name = "birthday", nullable = false)
        private Date birthday;

        @Column(name = "gender", nullable = false)
        private String gender;

        @Column(name = "job", nullable = false)
        private String employeeJob;

        @Column(name = "username", nullable = false, unique = true)
        private String username;

        @Column(name = "password", nullable = false)
        private String password;
    }
