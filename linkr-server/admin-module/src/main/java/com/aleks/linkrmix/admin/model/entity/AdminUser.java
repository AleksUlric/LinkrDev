package com.aleks.linkrmix.admin.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("admin_users")
public class AdminUser {
    
    @TableId(type = IdType.AUTO)
    private Long id;
    
    private String username;
    
    private String displayName;
    
    private String passwordHash;
    
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;
    
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;
}
