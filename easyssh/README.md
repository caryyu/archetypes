# 说明
Spring MVC/Spring/Hibernate

# 本地安装 Archetype
```
git clone https://github.com/caryyu/archetypes.git
cd archetypes/easyssh
mvn install
```

# 创建项目
```
mvn archetype:generate \
-DarchetypeCatalog=local \
-DarchetypeGroupId=com.github.carryu \
-DarchetypeArtifactId=easyssh-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=com.github.caryyu \
-DartifactId=easyssh
-Dversion=1.0-SNAPSHOT
```
