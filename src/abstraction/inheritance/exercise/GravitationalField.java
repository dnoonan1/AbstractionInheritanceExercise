package abstraction.inheritance.exercise;

/**
 *
 * @author Dan Noonan
 */
public class GravitationalField extends FundamentalForceField {
    // other extensions include ElectromagneticField, StrongNuclearForceField,
    // and WeakNuclearForceField
    
    static final Vector3d GRAVITY_VECTOR = new Vector3d(0.0, -9.8, 0.0);
    
    @Override
    public Vector3d getValueAt(Vector3d position) {
        return GRAVITY_VECTOR; // simplified!
    }
    
}
