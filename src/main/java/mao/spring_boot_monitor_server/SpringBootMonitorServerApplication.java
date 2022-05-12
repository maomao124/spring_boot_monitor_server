package mao.spring_boot_monitor_server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootMonitorServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootMonitorServerApplication.class, args);
    }

}
