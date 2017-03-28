package dataLayer;

import java.util.List;

import dataLayerInterfaces.DALException;
import dataTransferObject.ProduktBatchKomponentDTO;

public class ProduktBatchKomponentDAO implements dataLayerInterfaces.IProduktBatchKomponentDAO {

	@Override
	public ProduktBatchKomponentDTO getProduktBatchKomp(int pbId, int rbId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProduktBatchKomponentDTO> getProduktBatchKompList(int pbId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProduktBatchKomponentDTO> getProduktBatchKompList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProduktBatchKomp(ProduktBatchKomponentDTO produktbatchkomponent) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduktBatchKomp(ProduktBatchKomponentDTO produktbatchkomponent) throws DALException {
		// TODO Auto-generated method stub

	}

}
