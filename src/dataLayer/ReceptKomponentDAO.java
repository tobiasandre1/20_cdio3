package dataLayer;

import java.util.List;

import dataLayerInterfaces.DALException;
import dataLayerInterfaces.IReceptKomponentDAO;
import dataTransferObject.ReceptKomponentDTO;

public class ReceptKomponentDAO implements IReceptKomponentDAO {

	@Override
	public ReceptKomponentDTO getReceptKomp(int receptId, int raavareId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReceptKomponentDTO> getReceptKompList(int receptId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReceptKomponentDTO> getReceptKompList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createReceptKomp(ReceptKomponentDTO receptkomponent) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateReceptKomp(ReceptKomponentDTO receptkomponent) throws DALException {
		// TODO Auto-generated method stub

	}

}
