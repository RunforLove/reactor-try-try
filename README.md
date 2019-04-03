## Reactor模型

### Git将feature分支替换为master分支

```javascript

git checkout feature/xxx

git merge master

git branch -D master

git branch -m feature/xxx master

git push -f origin master

```