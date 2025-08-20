# LinkrDev 部署脚本

## 🚀 快速开始

### 完整部署 (推荐)
```bash
# 完整构建和部署
deploy-optimized.bat

# 停止所有服务
stop-optimized.bat
```

### 快速启动 (已部署后)
```bash
# 快速启动已部署的服务
start-services.bat

# 检查服务状态
check-status.bat
```

### 旧版本脚本 (兼容性)
```bash
# Windows 批处理版本
deploy.bat
stop.bat

# PowerShell 版本
.\deploy.ps1
.\stop.ps1
```

## 📋 脚本说明

### 🆕 优化版本 (推荐)
- **`deploy-optimized.bat`** - 完整部署脚本
  - ✅ 自动清理旧进程
  - ✅ 智能端口检测 (3000/3001)
  - ✅ 完善的错误处理
  - ✅ 详细的进度显示
  - ✅ 自动重试机制

- **`stop-optimized.bat`** - 优化停止脚本
  - ✅ 全面清理所有相关进程
  - ✅ 清理所有相关端口
  - ✅ 显示清理状态

- **`start-services.bat`** - 快速启动脚本
  - ✅ 仅启动已部署的服务
  - ✅ 不重新构建项目
  - ✅ 快速启动

- **`check-status.bat`** - 状态检查脚本
  - ✅ 显示所有服务状态
  - ✅ 显示端口占用情况
  - ✅ 显示文件状态
  - ✅ 显示访问地址

### 🔧 功能特性

#### deploy-optimized.bat
- ✅ 检查系统依赖 (Node.js, npm, Java, Maven)
- ✅ 检查项目目录结构
- ✅ 构建前端项目 (LinkrWeb)
- ✅ 构建后端项目 (LinkrMix)
- ✅ 智能端口管理 (自动选择可用端口)
- ✅ 启动后端服务 (端口 8081)
- ✅ 启动前端服务 (端口 3000/3001)
- ✅ 服务状态验证
- ✅ 详细的错误处理和日志

#### stop-optimized.bat
- ✅ 停止前端服务 (端口 3000/3001)
- ✅ 停止后端服务 (端口 8081)
- ✅ 停止 Dubbo 服务 (端口 20880/22222)
- ✅ 清理 Java 和 Node.js 进程
- ✅ 显示清理结果

## 🌐 访问地址

- **前端应用**: http://localhost:3000 (或 3001)
- **后端API**: http://localhost:8081
- **Dubbo管理**: http://localhost:22222

## 📝 日志文件

- **后端日志**: `deploy\backend\backend.log`
- **前端日志**: `deploy\frontend\frontend.log`

## 🔧 系统要求

- **Node.js**: 16+
- **npm**: 8+
- **Java**: 8+
- **Maven**: 3.6+

## 🛠️ 故障排除

### 常见问题

1. **端口被占用**
   - 脚本会自动检测并使用备用端口
   - 或运行 `stop-optimized.bat` 清理旧进程

2. **依赖安装失败**
   - 脚本会自动清理 npm 缓存并重试
   - 检查网络连接

3. **构建失败**
   - 检查 Node.js 和 Java 版本
   - 查看详细错误日志

4. **服务启动失败**
   - 检查端口是否被占用
   - 查看日志文件获取详细错误信息

### 调试命令

```bash
# 检查服务状态
check-status.bat

# 查看端口占用
netstat -ano | findstr ":3000\|:8081"

# 查看进程
tasklist | findstr "java\|node"
```

## 📚 使用流程

1. **首次部署**:
   ```bash
   deploy-optimized.bat
   ```

2. **日常使用**:
   ```bash
   start-services.bat    # 启动服务
   check-status.bat      # 检查状态
   stop-optimized.bat    # 停止服务
   ```

3. **重新部署**:
   ```bash
   stop-optimized.bat    # 停止服务
   deploy-optimized.bat  # 重新部署
   ```
