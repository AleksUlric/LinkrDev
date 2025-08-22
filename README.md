# MetaLinkr

## 📋 项目简介

MetaLinkr 是一个全栈管理系统平台，采用前后端分离架构，支持多端部署。

## 🏗️ 项目结构

```
MetaLinkr/
├── linkr-server/              # 后端服务
│   ├── admin-module/          # 管理员微服务模块
│   └── README.md              # 后端服务说明
├── linkr-client/              # 前端客户端
│   └── linkr-dashboard/       # PC端管理后台
├── deploy/                    # 部署相关文件
├── package.json               # 根目录脚本配置
└── README.md                  # 项目说明文档
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

**后端服务：**
```bash
cd linkr-server
mvn spring-boot:run
```

**前端服务：**
```bash
cd linkr-client/linkr-dashboard
npm install
npm run dev
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
- **构建工具**: Maven

### 前端
- **框架**: Vue 3.4.0
- **UI库**: Element Plus 2.8.8
- **状态管理**: Pinia 2.2.4
- **路由**: Vue Router 4.4.5
- **构建工具**: Vite 5.0.0

## 📝 开发规范

- 数据访问层命名为 **DAO** (Data Access Object)
- DTO类采用 **LoginDto** 这种命名规范
- 遵循RESTful API设计规范
- 使用统一的异常处理机制

## 🔄 版本历史

### v1.0.0 (当前版本)
- ✅ 完成项目重构，采用前后端分离架构
- ✅ 实现PC端管理后台
- ✅ 支持多端扩展架构
- ✅ 统一API响应格式
