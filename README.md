# MetaLinkr

## 📋 项目简介

MetaLinkr 是一个全栈管理系统平台，采用前后端分离架构，支持多端部署。项目集成了 Nacos 服务注册与配置中心，提供完整的微服务解决方案。

## 🏗️ 项目结构

```
MetaLinkr/
├── linkr-server/              # 后端服务
│   ├── admin-module/          # 管理员微服务模块
│   │   ├── src/main/java/     # Java源代码
│   │   │   └── com/aleks/linkrmix/admin/
│   │   │       ├── common/    # 公共组件
│   │   │       │   ├── config/    # 配置类
│   │   │       │   ├── response/  # 响应封装
│   │   │       │   └── exception/ # 异常处理
│   │   │       ├── controller/    # 控制器层
│   │   │       ├── service/       # 服务层
│   │   │       ├── manager/       # 管理层
│   │   │       ├── mapper/        # 数据访问层
│   │   │       └── model/         # 数据模型
│   │   │           ├── entity/    # 实体类
│   │   │           └── dto/       # 数据传输对象
│   │   ├── src/main/resources/    # 配置文件
│   │   └── pom.xml               # Maven配置
│   └── pom.xml                   # 父级Maven配置
├── linkr-client/              # 前端客户端
│   └── linkr-dashboard/       # PC端管理后台
│       ├── src/              # Vue源代码
│       ├── dist/             # 构建输出
│       └── package.json      # 前端依赖配置
├── nacos-server/             # Nacos服务注册与配置中心
│   ├── bin/                  # 启动脚本
│   ├── conf/                 # 配置文件
│   └── data/                 # 数据存储
├── deploy/                   # 部署相关文件
│   ├── backend/              # 后端部署文件
│   └── frontend/             # 前端部署文件
├── *.bat                     # Windows批处理脚本
├── package.json              # 根目录脚本配置
└── README.md                 # 项目说明文档
```

## 🚀 快速开始

### 环境要求
- JDK 1.8+
- Maven 3.6+
- MySQL 8.0+
- Node.js 16+

### 一键启动

```bash
# 安装依赖
npm run install:all

# 开发模式启动
npm run dev

# 构建项目
npm run build

# 生产模式启动
npm run start
```

### 分别启动

**Windows用户（推荐）：**
```bash
# 启动Nacos服务
start-nacos.bat

# 启动后端服务
start-backend.bat

# 启动前端服务
start-frontend.bat

# 检查服务状态
check-status.bat

# 停止所有服务
stop-all.bat
```

**手动启动：**

**1. 启动 Nacos 服务：**
```bash
cd nacos-server/bin
# Windows
startup.cmd -m standalone
# Linux/Mac
./startup.sh -m standalone
```

**2. 启动后端服务：**
```bash
cd linkr-server/admin-module
mvn spring-boot:run
```

**3. 启动前端服务：**
```bash
cd linkr-client/linkr-dashboard
npm install
npm run dev
```

## 🌐 服务访问

### 开发环境访问地址
- **Nacos控制台**: http://localhost:8848/nacos (账号: nacos, 密码: nacos)
- **Admin后端API**: http://localhost:8080
- **健康检查**: http://localhost:8080/actuator/health
- **前端页面**: http://localhost:5173

### 服务状态检查
```bash
# Windows
check-status.bat

# 或手动检查端口
netstat -ano | findstr :8080  # 检查后端服务
netstat -ano | findstr :5173  # 检查前端服务
netstat -ano | findstr :8848  # 检查Nacos服务
```

## 📱 多端支持

- **PC端管理后台** (`linkr-dashboard`) - Vue3 + Element Plus
- **移动端** (计划中) - React Native / Flutter
- **微信小程序** (计划中) - 原生小程序
- **H5端** (计划中) - Vue3 + Vant

## 🔧 技术栈

### 后端
- **框架**: Spring Boot 2.7.18
- **安全**: Spring Security 5.8.11
- **数据库**: MySQL 8.0.33
- **服务注册**: Nacos 2.2.3
- **构建工具**: Maven

### 前端
- **框架**: Vue 3.4.0
- **UI库**: Element Plus 2.8.8
- **状态管理**: Pinia 2.2.4
- **路由**: Vue Router 4.4.5
- **构建工具**: Vite 5.0.0
- **语言**: TypeScript

## 📝 开发规范

- 数据访问层命名为 **DAO** (Data Access Object)
- DTO类采用 **LoginDto** 这种命名规范
- 遵循RESTful API设计规范
- 使用统一的异常处理机制
- 采用微服务架构，支持服务注册与发现

## 🔄 版本历史

### v1.0.1 (当前版本)
- ✅ 优化项目结构，将config包移至common包下
- ✅ 修复Bean冲突问题，确保服务正常启动
- ✅ 完善批处理脚本，支持一键启动和状态检查
- ✅ 更新项目文档，提供详细的使用说明
- ✅ 优化服务注册和发现配置

### v1.0.0
- ✅ 完成项目重构，采用前后端分离架构
- ✅ 实现PC端管理后台
- ✅ 支持多端扩展架构
- ✅ 统一API响应格式
- ✅ 集成Nacos服务注册与配置中心
- ✅ 支持微服务部署

## 📞 联系方式

如有问题或建议，请通过以下方式联系：
- 项目地址：[GitHub Repository]
- 邮箱：[your-email@example.com]

## 📄 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。
