package Scope;

import ASTNode.Location;
import Util.SemanticError;

import java.util.HashMap;
import java.util.Map;

public class Scope
{
    private Map<String, Entity> map = new HashMap<String, Entity>();
    private Scope parent;
    private boolean isTop = false, isClass;

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
        if (!key.startsWith("@")) throw new SemanticError(String.format("ScopeEntity entity key Should start with \'@\' but get \"%s\"", key));
        if (map.containsKey(key)) throw new SemanticError(String.format("Name \"%s\" has been already defined", name));
        map.put(key, entity);
    }

    public void put(Location location, String name, String key, Entity entity)
    {
        if (!key.startsWith("@")) throw new SemanticError(location, String.format("Entity key Should start with \'@\' but get \"%s\"", key));
        if (map.containsKey(key)) throw new SemanticError(location, String.format("Name \"%s\" has been already defined", name));
        map.put(key, entity);
    }

    public Entity get(String key)
    {
        Entity entity = map.get(key);
        if (entity != null || isTop) return entity;
        return parent.get(key);
    }

    public Entity get(Location location, String name, String key)
    {
        Entity entity = map.get(key);
        if (entity != null) return entity;
        if (isTop) throw new SemanticError(location, String.format("Entity \"%s\" not found", name));
        else return parent.get(location, name, key);
    }

    public Entity selfGetVarFunc(Location location, String name)
    {
        if (map.containsKey("@V" + name)) return map.get("@V" + name);
        if (map.containsKey("@F" + name)) return map.get("@F" + name);
        throw new SemanticError(location, String.format("Entity \"%s\" not found", name));
    }

    public Entity getVarFunc(Location location, String name)
    {
        if (map.containsKey("@V" + name)) return map.get("@V" + name);
        if (map.containsKey("@F" + name)) return map.get("@F" + name);
        if (isTop) throw new SemanticError(location, String.format("Entity \"%s\" not found", name));
        return parent.getVarFunc(location, name);
    }

    public Entity selfGet(String key)
    {
        return map.get(key);
    }
}
