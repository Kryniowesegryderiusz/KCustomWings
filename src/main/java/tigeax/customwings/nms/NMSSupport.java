package tigeax.customwings.nms;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import java.lang.reflect.Method;

public class NMSSupport {

    public static Float getBodyRotation(LivingEntity livingEntity) {

        try {
            Class<?> entity = Class.forName(Bukkit.getServer().getClass().getPackage().getName() + ".entity.CraftLivingEntity");
            Method getBodyYaw = entity.getMethod("getBodyYaw");
            Object bodyYaw = getBodyYaw.invoke(livingEntity);
            return (Float) bodyYaw;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setBodyRotation(LivingEntity livingEntity, float newRotation) {

    	/*
        try {
            Class<?> entity = Class.forName(Bukkit.getServer().getClass().getPackage().getName() + ".entity.CraftLivingEntity");
            Method setBodyYaw = entity.getMethod("setBodyYaw");
            setBodyYaw.invoke(livingEntity, newRotation);
            livingEntity.teleport(livingEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

    }

}
