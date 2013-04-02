package cavani.endorfina.authority.core;

import cavani.endorfina.authority.api.CredentialModel;

public class CredentialEntry extends DirectoryEntry
{

	public CredentialEntry(final String id)
	{
		objectClasses.add("extensibleObject");
		objectClasses.add("account");
		objectClasses.add("top");

		attributes.put(objectClasses);
		attributes.put(CredentialModel.ID.value, id);
	}

	public void password(final char[] value)
	{
		attributes.put(CredentialModel.PW.value, new String(value));
	}

	public void pkcs12(final byte[] value)
	{
		attributes.put(CredentialModel.PKCS12.value, value);
	}

	public void certificate(final byte[] value)
	{
		attributes.put(CredentialModel.CERTIFICATE.value, value);
	}

}
