package seedu.address.testutil;

import seedu.address.logic.commands.EditOutletCommand.EditOutletDescriptor;
import seedu.address.model.outlet.Outlet;
import seedu.address.model.outlet.OutletAddress;
import seedu.address.model.outlet.OutletName;
import seedu.address.model.outlet.OutletPostalCode;

/**
 * A utility class to help with building EditOutletDescriptor objects.
 */
public class EditOutletDescriptorBuilder {

    private EditOutletDescriptor descriptor;

    public EditOutletDescriptorBuilder() {
        descriptor = new EditOutletDescriptor();
    }

    public EditOutletDescriptorBuilder(EditOutletDescriptor descriptor) {
        this.descriptor = new EditOutletDescriptor(descriptor);
    }

    /**
     * Returns an {@code EditOutletDescriptor} with fields containing {@code outlet}'s details
     */
    public EditOutletDescriptorBuilder(Outlet outlet) {
        descriptor = new EditOutletDescriptor();
        descriptor.setName(outlet.getOutletName());
        descriptor.setAddress(outlet.getOutletAddress());
        descriptor.setPostalCode(outlet.getPostalCode());
    }

    /**
     * Sets the {@code Name} of the {@code EditOutletDescriptor} that we are building.
     */
    public EditOutletDescriptorBuilder withName(String name) {
        descriptor.setName(new OutletName(name));
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code EditOutletDescriptor} that we are building.
     */
    public EditOutletDescriptorBuilder withAddress(String address) {
        descriptor.setAddress(new OutletAddress(address));
        return this;
    }

    /**
     * Sets the {@code PostalCode} of the {@code EditOutletDescriptor} that we are building.
     */
    public EditOutletDescriptorBuilder withPostalCode(String postalCode) {
        descriptor.setPostalCode(new OutletPostalCode(postalCode));
        return this;
    }

    public EditOutletDescriptor build() {
        return descriptor;
    }
}
