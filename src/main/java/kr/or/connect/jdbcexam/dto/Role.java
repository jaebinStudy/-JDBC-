package kr.or.connect.jdbcexam.dto;

public class Role {
    private Integer roleId;
    private String description;

    public Role(){

    }

    public Role(Integer roleId,String description){
        super();
        this.roleId = roleId;
        this.description = description;
    }

    public Integer getRoleid() {
        return roleId;
    }

    public void setRoleid(Integer roleid) {
        this.roleId = roleId;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    @Override
    public String toString(){
        return "Role [roleId="+roleId+",description=" + description +"]";
    }
}
