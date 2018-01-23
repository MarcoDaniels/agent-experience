# agent-experience

_agent-experience is the agent responsible for retrieving all work experience information to the operator_

## routes
```
/agent/experience/,
/agent/experience/{name},
/agent/wakeup,
```

agent-experience is part of [my little virtual friend](http://mylittlevirtualfriend.com) setup.

## todo
- [x] repository in model to get experience(s) with interfaces
- [x] agent controller using repository 
- [x] get experience by name?!
- [x] agent/wakeup endpoint
- [ ] post/put/delete endpoints
- [ ] setup authentication for post/put/delete endpoints
- [ ] setup a database instead of inMemory?