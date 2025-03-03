package baguchan.earthmobsmod.client.render.layer;

import baguchan.earthmobsmod.client.model.VilerWitchModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class VilerWitchItemLayer<T extends LivingEntity> extends CrossedArmsItemLayer<T, VilerWitchModel<T>> {
	public VilerWitchItemLayer(RenderLayerParent<T, VilerWitchModel<T>> p_117672_, ItemInHandRenderer p_234927_) {
		super(p_117672_, p_234927_);
	}

	public void render(PoseStack p_117685_, MultiBufferSource p_117686_, int p_117687_, T p_117688_, float p_117689_, float p_117690_, float p_117691_, float p_117692_, float p_117693_, float p_117694_) {
		ItemStack itemstack = p_117688_.getMainHandItem();
		p_117685_.pushPose();
		if (itemstack.is(Items.POTION)) {
			this.getParentModel().getNose().translateAndRotate(p_117685_);
			p_117685_.translate(0.0625D, 0.25D, 0.0D);
			p_117685_.mulPose(Vector3f.ZP.rotationDegrees(180.0F));
			p_117685_.mulPose(Vector3f.XP.rotationDegrees(140.0F));
			p_117685_.mulPose(Vector3f.ZP.rotationDegrees(10.0F));
			p_117685_.translate(0.0D, (double) -0.4F, (double) 0.4F);
		}

		super.render(p_117685_, p_117686_, p_117687_, p_117688_, p_117689_, p_117690_, p_117691_, p_117692_, p_117693_, p_117694_);
		p_117685_.popPose();
	}
}