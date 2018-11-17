package com.firejar710.mechima.common.block;

import com.firejar710.mechima.common.states.MaterialProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;

public class BlockAxel extends BlockMechima {

    public static final PropertyEnum<MaterialProperty> material = PropertyEnum.create("material", MaterialProperty.class);
    public static final PropertyDirection facing = PropertyDirection.create("facing");

    protected BlockAxel(MaterialProperty materialProperty) {
        super("axel", Material.PISTON);

        this.setDefaultState(this.blockState.getBaseState().withProperty(material, materialProperty));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, material, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return super.getMetaFromState(state);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return super.getStateFromMeta(meta);
    }
}
