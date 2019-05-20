package Scope;

import Util.SemanticError;

import java.util.HashMap;
import java.util.Map;

public class Scope
{
    private Map<String, Entity> map = new HashMap<String, Entity>();
    private Scope parent;
    private boolean isTop = false;
    private boolean isClass;

    public Scope() {}

    public Scope(Scope parent, boolean isClass)
    {
        this.parent = parent;
        this.isClass = isClass;
    }

    public void setTop(boolean isTop)
    {
        this.isTop = isTop;
    }

    public boolean isTop()
    {
        return isTop;
    }

    public Scope getParent()
    {
        return parent;
    }

    public void put(String name, String key, Entity entity)
    {
        if (!key.startsWith("__")) throw new SemanticError(String.format("ScopeEntity entity key Should start with \'__\' but get \"%s\"", key));
        if (map.containsKey(key)) throw new SemanticError(String.format("Name \"%s\" has been already defined", name));
        map.put(key, entity);
    }

    public void put(int line, String name, String key, Entity entity)
    {
        if (!key.startsWith("__")) throw new SemanticError(line, String.format("Entity key Should start with \'__\' but get \"%s\"", key));
        if (map.containsKey(key)) throw new SemanticError(line, String.format("Name \"%s\" has been already defined", name));
        map.put(key, entity);
    }

    public Entity get(String key)
    {
        Entity entity = map.get(key);
        if (entity != null || isTop) return entity;
        return parent.get(key);
    }

    public Entity get(int line, String name, String key)
    {
        Entity entity = map.get(key);
        if (entity != null) return entity;
        if (isTop) throw new SemanticError(line, String.format("Entity \"%s\" not found", name));
        else return parent.get(line, name, key);
    }

    public Entity selfGetVarFunc(int line, String name)
    {
        if (map.containsKey("__V_" + name)) return map.get("__V_" + name);
        if (map.containsKey("__F_" + name)) return map.get("__F_" + name);
        throw new SemanticError(line, String.format("Entity \"%s\" not found", name));
    }

    public Entity getVarFunc(int line, String name)
    {
        if (map.containsKey("__V_" + name)) return map.get("__V_" + name);
        if (map.containsKey("__F_" + name)) return map.get("__F_" + name);
        if (isTop) throw new SemanticError(line, String.format("Entity \"%s\" not found", name));
        return parent.getVarFunc(line, name);
    }

    public Entity selfGet(String key)
    {
        return map.get(key);
    }
}
