package com.baomidou;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.util.*;

public class MyCodeGenerator {
    private static Properties loadYml(String filePath) {
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(new FileSystemResource(filePath));
        return factoryBean.getObject();
    }

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        Properties properties = loadYml(String.join(File.separator, projectPath, "src", "main", "resources", "application.yml"));

        FastAutoGenerator.create(
                        properties.getProperty("spring.datasource.url"),
                        properties.getProperty("spring.datasource.username"),
                        properties.getProperty("spring.datasource.password")
                ).globalConfig( // 全局配置
                        builder -> {
                            builder.outputDir(projectPath + "/src/main/java") //指定输出目录
                                    .author("Chris Zhao") // 设置作者
                                    .enableSwagger()//开启 swagger 模式
                                    .enableSpringdoc()//开启 springdoc 模式
                                    .disableOpenDir() //禁止打开输出目录
                                    .dateType(DateType.ONLY_DATE).commentDate("yyyy-MM-dd"); //时间策略
                        }
                ).packageConfig( // 包配置
                        builder -> {
                            builder.parent("org.wqf.ExchangeRatesServ.repository") // 设置父包名
                                    .entity("entity.po")//Entity 包名
                                    .service("service")//Service 包名
                                    .serviceImpl("service.impl")//Service Impl 包名
                                    .mapper("mapper")//Mapper 包名
                                    .pathInfo(Collections.singletonMap(OutputFile.xml,
                                            projectPath + "/src/main/resources/mapper/")) // 设置mapperXml生成路径
                                    .controller("controller"); //Controller 包名
                        }
                ).strategyConfig( // 策略配置
                        builder -> {
                            builder.enableCapitalMode() //开启大写命名

                                    .entityBuilder() // 实体类策略配置
                                    .superClass(BaseEntity.class) //设置父类
                                    .disableSerialVersionUID() //禁用生成 serialVersionUID
                                    .enableChainModel() //开启链式模型
                                    .enableLombok() //开启 lombok 模型
                                    .enableRemoveIsPrefix() //开启 Boolean 类型字段移除 is 前缀
                                    .enableTableFieldAnnotation() //开启生成实体时生成字段注解
                                    .enableActiveRecord()//开启 ActiveRecord 模型
                                    .naming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略 默认下划线转驼峰命名:NamingStrategy.underline_to_camel
                                    .columnNaming(NamingStrategy.underline_to_camel)//数据库表字段映射到实体的命名策略
                                    .enableFileOverride()//覆盖已有文件
                                    .versionColumnName("version")

                                    .enableColumnConstant()//开启生成字段常量
                                    .controllerBuilder() // 控制器策略配置
                                    .enableRestStyle() //开启生成@RestController 控制器
                                    .enableFileOverride() //覆盖已有文件

                                    .serviceBuilder() // 业务类策略配置
                                    .superServiceClass(IService.class)// 设置 service 接口父类
                                    .superServiceImplClass(ServiceImpl.class) //设置 service 实现类父类
                                    .formatServiceFileName("%sService")//格式化 service 接口文件名称
                                    .formatServiceImplFileName("%sServiceImp")//格式化 service 实现类文件名称
                                    .enableFileOverride() //覆盖已有文件

                                    .mapperBuilder() // 映射文件策略配置
                                    .superClass(BaseMapper.class)//设置父类
                                    .enableMapperAnnotation()//开启 @Mapper 注解
                                    .enableBaseResultMap() //启用 BaseResultMap 生成
                                    .enableBaseColumnList() //启用 BaseColumnList
                                    .enableFileOverride(); //覆盖已有文件

                            List<String> tables = new ArrayList<>();
                            tables.add("quotation_aud");
                            tables.add("quotation_cad");
                            tables.add("quotation_chf");
                            tables.add("quotation_eur");
                            tables.add("quotation_gbp");
                            tables.add("quotation_hkd");
                            tables.add("quotation_jpy");
                            tables.add("quotation_nzd");
                            tables.add("quotation_sgy");
                            tables.add("quotation_usd");

                            builder.addInclude(tables) // 请设置需要生成的表名
                                    .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                        }
                ).templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
